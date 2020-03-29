package facade.ver02;

public class ConfigManager {
	private static ConfigManager manager = null;
	private static ConfigModel cm = null;

	public static ConfigManager getInstance() {
		if (manager == null) {
			manager = new ConfigManager();
			cm = new ConfigModel();
		}
		return manager;
	}

	public ConfigModel getConfigDate() {
		return cm;
	}
}
