package jp.co.netmile.crwdsrc.dto.enumeration;

import jp.co.netmile.crwdsrc.dto.FancrewObject;

/**
 * 提出状態
 *
 * @author Kenkichi Mahara
 *
 */
public enum SubmitState implements FancrewObject {
	提出待ち,
	チェック待ち,
	チェック完了,
	請求完了,
	請求不可能
	;
}
