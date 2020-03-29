package builder.ver00;

import java.util.Collection;
import java.util.Map;

public class ExportToXml {
    /*
     * 导出数据到XML文件
     */
    public void export(ExportHeaderModel ehm,
        Map<String,Collection<ExportDataModel>> mapData,
        ExportFooterModel efm) {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<?xml version='1.0' encoding='gb2312'?>\n");
        buffer.append("<Report>\n");
        buffer.append("  <Header>\n");
        buffer.append("    <DepId>"+ehm.getDepId() + "</DepId>\n");
        buffer.append("    <ExportDate>" + ehm.getExportDate()+"</ExportDate>\n");
        buffer.append("  </Header>\n");
        buffer.append("  <Body>\n");
        for(String tblName:mapData.keySet()) {
            buffer.append("    <Datas TableName=\"" + tblName + "\">\n");
            for(ExportDataModel edm : mapData.get(tblName)) {
                buffer.append("   <Data>\n");
                buffer.append("      <ProductId>" + edm.getProductId() + "</ProductId>\n");
                buffer.append("      <Price>"+ edm.getPrice() + "</Price>\n");
                buffer.append("      <Amount>" + edm.getAmount()+"</Amount>\n");
                buffer.append("    </Data>\n");
            }
            buffer.append("    </Datas>\n");
        }
        buffer.append("  </Body>\n");
        buffer.append("  <Footer>\n");
        buffer.append("     <ExportUser>" + efm.getExportUser() + "</ExportUser>\n");
        buffer.append("  </Footer>\n");
        buffer.append("</Report>\n");
        System.out.println("输出到XML文件的内容：\n" + buffer);
    }

}
