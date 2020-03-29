package builder.ver01;

public class ConcreteBuilder implements Builder {

    /*
     * 生成器最终构建得产品对象
     */
    private Product resultProduct;
    
    @Override
    public void buildPart() {
        // TODO Auto-generated method stub
        
    }

    /*
     * 获取生成器最终构建得产品对象
     */
    public Product getResult() {
        return resultProduct;
    }
    
}
