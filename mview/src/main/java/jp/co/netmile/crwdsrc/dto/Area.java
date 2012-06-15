package jp.co.netmile.crwdsrc.dto;

/**
 * エリア
 *
 * @author Kenkichi Mahara
 *
 */
public class Area implements FancrewObject {
	/** ID */
	private int id;

	/** エリア名 */
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

	/* ================================================================= */
	// test

}
