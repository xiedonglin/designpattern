package singleton.ver02;

/**
 * 采用枚举类型的单例模式
 */
public enum EnumDirector {

  INSTANCE;

  @Override
  public String toString() {
    return getDeclaringClass().getCanonicalName() + "@" + hashCode();
  }
}
