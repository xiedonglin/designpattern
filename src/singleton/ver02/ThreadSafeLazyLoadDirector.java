package singleton.ver02;

/**
 * “懒汉式”的单例模式-线程安全的
 */
public final class ThreadSafeLazyLoadDirector {

  private static volatile ThreadSafeLazyLoadDirector INSTANCE;

  private ThreadSafeLazyLoadDirector() {
    // 防止通过反射进行实例化
    if (null != INSTANCE) {
      throw new IllegalStateException("该实例已经存在");
    }
  }

  /**
   * 此方法被第一次调用时才会生成单例实例，实现懒加载
   */
  public static synchronized ThreadSafeLazyLoadDirector getInstance() {
    if (null == INSTANCE) {
      INSTANCE = new ThreadSafeLazyLoadDirector();
    }
    return INSTANCE;
  }
}
