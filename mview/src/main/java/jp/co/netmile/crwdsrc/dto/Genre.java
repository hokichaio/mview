package jp.co.netmile.crwdsrc.dto;

/**
 * ジャンル
 *
 * @author Kenkichi Mahara
 *
 */
public class Genre implements FancrewObject {
	/** ID */
	private int id;

	/** ジャンル名 */
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
