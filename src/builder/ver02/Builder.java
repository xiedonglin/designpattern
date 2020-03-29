package builder.ver02;

import java.util.Collection;
import java.util.Map;

public interface Builder {

    public void buildHeader(ExportHeaderModel ehm);
    
    public void buildBody(Map<String,Collection<ExportDataModel>> mapData);
    
    public void buildFooter(ExportFooterModel efm);
}
