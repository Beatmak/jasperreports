package co.zooloop.jasperreports.adapter;

import net.sf.jasperreports.data.AbstractDataAdapter;

public class PentahoCdaDataAdapterImpl  extends AbstractDataAdapter implements  PentahoCdaDataAdapter {
	private String username;
	private String password;

	private String solution;
	private String path;
	private String file;

	private boolean sugarMode;

	private transient String baseUrl;
	
	private String dataAccessId;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSolution() {
		return solution;
	}

	public void setSolution(String solution) {
		this.solution = solution;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public boolean isSugarMode() {
		return sugarMode;
	}

	public void setSugarMode(boolean sugarMode) {
		this.sugarMode = sugarMode;
	}

	public String getBaseUrl() {
		return baseUrl;
	}

	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}

	public String getDataAccessId() {
		return dataAccessId;
	}

	public void setDataAccessId(String dataAccessId) {
		this.dataAccessId = dataAccessId;
	}
	
}