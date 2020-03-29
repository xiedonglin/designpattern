package builder.ver01;

public class Director {

    private Builder builder;
    
    public Director(Builder builder) {
        this.builder= builder;
    }

    /*
     * 示意方法，知道生成器构建最终的产品对象
     */
    public void construct() {
        builder.buildPart();
    }
    
}
