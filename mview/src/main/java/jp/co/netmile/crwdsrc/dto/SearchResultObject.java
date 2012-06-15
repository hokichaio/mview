package jp.co.netmile.crwdsrc.dto;

/**
 * 検索条件・結果を含むファンくる・オブジェクト
 *
 * @author Kenkichi Mahara
 *
 */
public abstract class SearchResultObject implements FancrewObject {
	/** 検索条件・結果 */
	private SearchResultCondition condition;

	/* ================================================================= */
	// delegates

	public void setMax(int max) {
		if (condition == null) {
			condition = new SearchResultCondition();
		}

		condition.setMax(max);
	}

	public void setOffset(int offset) {
		if (condition == null) {
			condition = new SearchResultCondition();
		}

		condition.setOffset(offset);
	}

	public void setNum(int num) {
		if (condition == null) {
			condition = new SearchResultCondition();
		}

		condition.setNum(num);
	}

	/* ================================================================= */
	// getter/setter

	public SearchResultCondition getCondition() {
		return condition;
	}

	public void setCondition(SearchResultCondition condition) {
		this.condition = condition;
	}
}
