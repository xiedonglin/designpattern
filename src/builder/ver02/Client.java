package builder.ver02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;



public class Client {
    public static void main(String[] args) {
        ExportHeaderModel ehm = new ExportHeaderModel();
        ehm.setDepId("一分公司");
        ehm.setExportDate("2010-05-18");
        
        Map<String,Collection<ExportDataModel>> mapData= new HashMap<String,Collection<ExportDataModel>>();
        Collection<ExportDataModel> col = new ArrayList<ExportDataModel>();
        ExportDataModel edm1 = new ExportDataModel();
        edm1.setProductId("产品001号");
        edm1.setPrice(1000);
        edm1.setAmount(80);
        

        ExportDataModel edm2 = new ExportDataModel();
        edm2.setProductId("产品002号");
        edm2.setPrice(99);
        edm2.setAmount(55);
        col.add(edm1);
        col.add(edm2);
        mapData.put("销售记录表", col);
        
        ExportFooterModel efm = new ExportFooterModel();
        efm.setExportUser("张三");

        
        TxtBuilder toTxt = new TxtBuilder();
        Director dir = new Director(toTxt);
        dir.construct(ehm, mapData, efm);
        System.out.println(toTxt.getBuffer());
        
        XmlBuilder toXml = new XmlBuilder();
        dir = new Director(toXml);
        dir.construct(ehm, mapData, efm);
        System.out.println(toXml.getBuffer());

    }
}
