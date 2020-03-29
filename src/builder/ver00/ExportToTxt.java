package builder.ver00;

import java.util.Collection;
import java.util.Map;

public class ExportToTxt {

    /*
     * 导出数据到文本文件
     */
    public void export(ExportHeaderModel ehm,
        Map<String,Collection<ExportDataModel>> mapData,ExportFooterModel efm
        ) {
        StringBuffer buffer = new StringBuffer();
        buffer.append(ehm.getDepId()+","+ehm.getExportDate()+"\n");
        for(String tblName:mapData.keySet()) {
            buffer.append(tblName+"\n");
            for(ExportDataModel edm:mapData.get(tblName)) {
                buffer.append(edm.getProductId()+","+edm.getPrice()+","+edm.getAmount()+"\n");
            }
        }
        buffer.append(efm.getExportUser());
        System.out.println("输出到文本文件的内容；\n" + buffer);
    }
    
}
