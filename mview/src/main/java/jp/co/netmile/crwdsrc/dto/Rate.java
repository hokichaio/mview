package jp.co.netmile.crwdsrc.dto;

/**
 * ユーザ<br />
 *
 * @author Kenkichi Mahara
 *
 */
public class Rate implements FancrewObject {
	private String type;
	private long value;
	private Long limit;

	/* ================================================================= */
	// インスタンス生成

	public Rate() {
	}

	/* ================================================================= */
	// methods

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getValue() {
		return value;
	}

	public void setValue(long value) {
		this.value = value;
	}

	public Long getLimit() {
		return limit;
	}

	public void setLimit(Long limit) {
		this.limit = limit;
	}

}
