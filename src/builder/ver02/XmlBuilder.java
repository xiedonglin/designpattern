package builder.ver02;

import java.util.Collection;
import java.util.Map;

public class XmlBuilder implements Builder {

    private StringBuffer buffer = new StringBuffer();
    @Override
    public void buildHeader(ExportHeaderModel ehm) {
        buffer.append("<?xml version='1.0' encoding='gb2312'?>\n");
        buffer.append("<Report>\n");
        buffer.append("  <Header>\n");
        buffer.append("    <DepId>"+ehm.getDepId() + "</DepId>\n");
        buffer.append("    <ExportDate>" + ehm.getExportDate()+"</ExportDate>\n");
        buffer.append("  </Header>\n");
    }

    @Override
    public void buildBody(Map<String, Collection<ExportDataModel>> mapData) {
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
    }

    @Override
    public void buildFooter(ExportFooterModel efm) {
        buffer.append("  </Body>\n");
        buffer.append("  <Footer>\n");
        buffer.append("     <ExportUser>" + efm.getExportUser() + "</ExportUser>\n");
        buffer.append("  </Footer>\n");
        buffer.append("</Report>\n");        
    }

    public StringBuffer getBuffer() {
        return buffer;
    }

}
