package jp.co.netmile.crwdsrc.dto.enumeration;

import jp.co.netmile.crwdsrc.dto.FancrewObject;

/**
 * 表示モード<br />
 *
 * @author Kenkichi Mahara
 *
 */
public enum ViewMode implements FancrewObject {
	/** 管理画面等でのみ表示可能 */
	非表示(0),

	/** 直リンクでアクセスすれば表示可能 */
	限定公開(1),

	/** 全員に公開 */
	表示(2),
	;

	/** 表示モードID */
	private final int id;

	/* ================================================================= */
	// インスタンス生成

	private ViewMode(int id) {
		this.id = id;
	}

	public static ViewMode valueOfId(int id) {
		if (id >= 0 && id <= 2) {
			return values()[id];
		}

		return null;
	}

	public int getId() {
		return id;
	}

}
