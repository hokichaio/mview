package jp.co.netmile.crwdsrc.dto.enumeration;

import java.util.ArrayList;
import java.util.List;

import jp.co.netmile.crwdsrc.dto.FancrewObject;

/**
 * 都道府県
 *
 * @author Kenkichi Mahara
 *
 */
public enum Prefecture implements FancrewObject {
	全国(0, "全国"),

	北海道(1, "北海道"),
	青森県(2, "青森"),
	岩手県(3, "岩手"),
	宮城県(4, "宮城"),
	秋田県(5, "秋田"),
	山形県(6, "山形"),
	福島県(7, "福島"),

	茨城県(8, "茨城"),
	栃木県(9, "栃木"),
	群馬県(10, "群馬"),
	埼玉県(11, "埼玉"),
	千葉県(12, "千葉"),
	東京都(13, "東京"),
	神奈川県(14, "神奈川"),

	新潟県(15, "新潟"),
	富山県(16, "富山"),
	石川県(17, "石川"),
	福井県(18, "福井"),
	山梨県(19, "山梨"),
	長野県(20, "長野"),

	岐阜県(21, "岐阜"),
	静岡県(22, "静岡"),
	愛知県(23, "愛知"),
	三重県(24, "三重"),

	滋賀県(25, "滋賀"),
	京都府(26, "京都"),
	大阪府(27, "大阪"),
	兵庫県(28, "兵庫"),
	奈良県(29, "奈良"),
	和歌山県(30, "和歌山"),

	鳥取県(31, "鳥取"),
	島根県(32, "島根"),
	岡山県(33, "岡山"),
	広島県(34, "広島"),
	山口県(35, "山口"),

	徳島県(36, "徳島"),
	香川県(37, "香川"),
	愛媛県(38, "愛媛"),
	高知県(39, "高知"),

	福岡県(40, "福岡"),
	佐賀県(41, "佐賀"),
	長崎県(42, "長崎"),
	熊本県(43, "熊本"),
	大分県(44, "大分"),
	宮崎県(45, "宮崎"),
	鹿児島県(46, "鹿児島"),
	沖縄県(47, "沖縄"),
	;

	/** 都道府県コード */
	private final int id;

	/** 県名。最後に「都道府県」を付けない。 */
	private final String simpleName;

	/** 「全国」を除いた都道府県一覧 */
	private static final Prefecture[] PREFECTURE_INSTANCES;

	static {
		List<Prefecture> prefectureList = new ArrayList<Prefecture>();
		for (Prefecture prefecture : values()) {
			 if (prefecture.id != 0) {
				 prefectureList.add(prefecture);
			 }
		}
		PREFECTURE_INSTANCES = prefectureList.toArray(new Prefecture[0]);
	}

	/* ================================================================= */
	// インスタンス生成

	private Prefecture(int id, String simpleName) {
		this.id = id;
		this.simpleName = simpleName;
	}

	public static Prefecture valueOfId(int id) {
		for (Prefecture prefecture : values()) {
			if (prefecture.id == id) {
				return prefecture;
			}
		}
		return null;
	}

	/**
	 * 「全国」を除いた都道府県一覧を取得する。
	 *
	 * @return
	 */
	public static Prefecture[] valuesWithoutZenkoku() {
		return PREFECTURE_INSTANCES;
	}

	public int getId() {
		return id;
	}

	public String getSimpleName() {
		return simpleName;
	}

}
