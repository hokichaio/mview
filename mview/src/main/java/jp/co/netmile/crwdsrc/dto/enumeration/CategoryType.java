package jp.co.netmile.crwdsrc.dto.enumeration;

import jp.co.netmile.crwdsrc.dto.FancrewObject;

/**
 * カテゴリ種別
 *
 * @author Kenkichi Mahara
 *
 */
public enum CategoryType implements FancrewObject {
	リアル(1),
	通販(2)
	;

	private final int id;

	/* ================================================================= */
	// インスタンス生成

	private CategoryType(int id) {
		this.id = id;
	}

	public static CategoryType valueOfId(int id) {
		for (CategoryType obj : values()) {
			if (obj.id == id) {
				return obj;
			}
		}

		return null;
	}

	public int getId() {
		return id;
	}

}
