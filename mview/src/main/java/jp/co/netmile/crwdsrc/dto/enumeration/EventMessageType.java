package jp.co.netmile.crwdsrc.dto.enumeration;

import jp.co.netmile.crwdsrc.dto.FancrewObject;

/**
 * EventMessage のイベント種別
 *
 * @author Kenkichi Mahara
 *
 */
public enum EventMessageType implements FancrewObject {
	ファンくる_当選					(1, "当選"),
	ファンくる_モニター応募受付完了	(2, "モニター応募受付完了"),
	ファンくる_仮当選				(3, "仮当選"),
	ファンくる_アンケート提出完了	(4, "アンケート提出完了"),
	ファンくる_アンケート審査NG		(5, "アンケート審査NG"),
	ファンくる_アンケート審査OK		(6, "アンケート審査OK"),
	ファンくる_レシート提出完了		(7, "レシート(購入確認)提出完了"),
	ファンくる_レシート審査NG		(8, "レシート(購入確認)審査NG"),
	ファンくる_レシート審査OK		(9, "レシート(購入確認)審査OK"),
	ファンくる_納品書提出完了		(10, "納品書提出完了"),
	ファンくる_納品書審査NG			(11, "納品書審査NG"),
	ファンくる_納品書審査OK			(12, "納品書審査OK"),
	ファンくる_キャンセル			(13, "キャンセル"),
	ファンくる_モニター完了			(14, "モニター完了"),
	ファンくる_ポイント仮付与		(15, "ポイント仮付与"),
	ファンくる_提出期限通知			(16, "提出期限通知"),
	ファンくる_提出期限延長			(17, "提出期限延長"),
	ファンくる_再提出期限通知		(18, "再提出期限通知"),
	ファンくる_繰り上げ当選			(19, "繰り上げ当選"),
	ファンくる_繰り上げ当選確定		(20, "繰り上げ当選確定"),
	ファンくる_購入情報審査NG		(21, "購入情報審査NG"),
	ファンくる_モニター却下			(22, "モニター却下"),
	;

	private final int id;
	private final String name;

	private EventMessageType(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static EventMessageType valueOfId(int id) {
		for (EventMessageType obj : values()) {
			if (obj.id == id) {
				return obj;
			}
		}

		return null;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
