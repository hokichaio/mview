package jp.co.netmile.crwdsrc.dto.enumeration;

import jp.co.netmile.crwdsrc.dto.FancrewObject;



/**
 * 当選状態
 *
 * @author Kenkichi Mahara
 *
 */
public enum WinState implements FancrewObject {
// 応募可能状態
	応募可能,
	繰り上げ当選,

// 落選（24時間後に再応募可能）
	落選,

// 当選済み
	当選,
	匿名で応募して当選,
	翌月モニター予約サービスで当選中,
	仮当選中,

// 同月中の最応募不可
	完了,
	添削期限切れ,
	モニター無効,

// その他
	抽選待ち,

	;
}
