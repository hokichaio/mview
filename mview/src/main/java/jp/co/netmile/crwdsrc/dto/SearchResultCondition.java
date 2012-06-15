package jp.co.netmile.crwdsrc.dto;

/**
 * 検索結果の表示件数に関する情報
 *
 * @author Yoshitada Tanahara
 *
 */
public final class SearchResultCondition {

	/** 検索結果総数 */
	private int max;

	/** 検索結果の取得開始位置 */
	private int offset;

	/** 1回の検索で取得する件数 */
	private int num;

	/* ================================================================= */
	// getter/setter

	public int getMax() {
		return max;
	}

	public int getOffset() {
		return offset;
	}

	public int getNum() {
		return num;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public void setNum(int num) {
		this.num = num;
	}
}