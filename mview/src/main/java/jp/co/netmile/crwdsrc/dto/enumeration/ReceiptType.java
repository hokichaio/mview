package jp.co.netmile.crwdsrc.dto.enumeration;


import jp.co.netmile.crwdsrc.dto.FancrewObject;



/***
 * レシート扱いのタイプ (通販では購入情報入力のタイプ)<br />
 *
 * @author Kenkichi Mahara
 */
public enum ReceiptType implements FancrewObject {
	/**
	 * リアルでレシート画像提出が必要なもの。
	 */
	必要(1),

	/**
	 * (1) リアルで、レシート提出不要の場合<br />
	 * (2) 通販で、購入確認が不要の場合（例: ファンくるTRY）<br />
	 */
	不必要(2),

	/**
	 * 通販で、購入番号の入力が必要。
	 */
	通販入力(3),

	/**
	 * 通販で、購入番号の入力が不要なもの。<br />
	 * EC サイトと ROI 間で自動的に購入確認が行われる。
	 */
	通販承認(4),

	/**
	 * 通販のチケットモニター用。<br />
	 *
	 * チケット画像をアップロードする。
	 */
	チケット(5),
	;

	private final int id;

	private ReceiptType(int id) {
		this.id = id;
	}

	public static ReceiptType valueOfId(int id) {
		for (ReceiptType obj : values()) {
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

