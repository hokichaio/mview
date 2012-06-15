package jp.co.netmile.crwdsrc.dto;

/**
 * カテゴリ
 *
 * @author Kenkichi Mahara
 *
 */
public class Category implements FancrewObject {
	/** ID */
	private int id;

	/** カテゴリ名 */
	private String name;

	/* ================================================================= */
	// getter/stter

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
