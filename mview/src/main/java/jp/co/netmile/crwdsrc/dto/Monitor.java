package jp.co.netmile.crwdsrc.dto;

import java.util.List;

import jp.co.netmile.crwdsrc.dto.enumeration.ReceiptType;


/**
 * xml 出力用 モニター情報
 *
 * @author Kenkichi Mahara
 *
 */
public class Monitor implements FancrewObject {
	/** ID */
	private Long id;

	/** モニタータイトル。 例: 謝礼： ご飲食代金の５０％ （上限 ５，０００円） */
	private String title;

	/** 「提出期限」の文言。例: アンケート・レシート提出期限 */
	private String deliverable;

	/** 当選してからのアンケート提出期限日数 [日]。 */
	private int enqueteSubmitExpires;

	/** 当選上限・人数の文言。例: 30名 */
	private String rate;

	/** レシート(通販では購入情報)の提出方法 */
	private ReceiptType receiptType;

	/** 「残枠が 0」等の理由により、グレイ表示が必要か？ このフラグは閲覧ユーザによって左右される。 */
	private boolean isGray;

	/** 期間短縮モニターか？ */
	private boolean isQuickAppFlg;

	/** 100%当選モードか？このフラグは閲覧ユーザによって左右される。 */
	private boolean isWin100;

	/** 注意事項 */
	private List<String> notices;

	/** モニター対象店舗(商品) */
	private Shop shop;

	/* ================================================================= */
	// Digester 用 setter

	public void setReceiptTypeString(String name) {
		this.receiptType = ReceiptType.valueOf(name);
	}

	/* ================================================================= */
	// getter/setter

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDeliverable() {
		return deliverable;
	}

	public void setDeliverable(String deliverable) {
		this.deliverable = deliverable;
	}

	public int getEnqueteSubmitExpires() {
		return enqueteSubmitExpires;
	}

	public void setEnqueteSubmitExpires(int enqueteSubmitExpires) {
		this.enqueteSubmitExpires = enqueteSubmitExpires;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public ReceiptType getReceiptType() {
		return receiptType;
	}

	public void setReceiptType(ReceiptType receiptType) {
		this.receiptType = receiptType;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	public List<String> getNotices() {
		return notices;
	}

	public void setNotices(List<String> notices) {
		this.notices = notices;
	}

	public boolean isGray() {
		return isGray;
	}

	public void setGray(boolean isGray) {
		this.isGray = isGray;
	}

	public boolean isQuickAppFlg() {
		return isQuickAppFlg;
	}

	public void setQuickAppFlg(boolean isQuickAppFlg) {
		this.isQuickAppFlg = isQuickAppFlg;
	}

	public boolean isWin100() {
		return isWin100;
	}

	public void setWin100(boolean isWin100) {
		this.isWin100 = isWin100;
	}

}
