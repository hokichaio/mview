package jp.co.netmile.crwdsrc.dto.enumeration;

import jp.co.netmile.crwdsrc.dto.FancrewObject;


/**
 * 性別
 *
 * @author Kenkichi Mahara
 *
 */
public enum Gender implements FancrewObject {
	男性(0),
	女性(1),
	;

	private final int id;

	private Gender(int id) {
		this.id = id;
	}

	/**
	 * 性別の id から Gender を取得します。
	 * 適切な id でない場合は null を返します。
	 *
	 * @param id
	 * @return
	 */
	public static Gender valueOfId(int id) {
		for (Gender obj : values()) {
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
