package jp.co.netmile.crwdsrc.dto;

import jp.co.netmile.crwdsrc.dto.enumeration.SubmitState;
import jp.co.netmile.crwdsrc.dto.enumeration.WinState;


/**
 * 応募情報
 *
 * @author Kenkichi Mahara
 *
 */
public class Application implements FancrewObject {
	/** ID */
	private Long id;

	/** 当選状態 */
	private WinState winState;

	/** アンケート提出状態 */
	private SubmitState enqueteSubmitState;

	/** レシート画像・購入情報 提出状態 */
	private SubmitState receiptSubmitState;

	/** 納品書画像 提出状態 */
	private SubmitState invoiceSubmitState;

	/** 事前確認画面で同意したか？ */
	private boolean agreed;

	/** 当選したモニター */
	private Monitor monitor;

	/** 当選したユーザ */
	private User user;

	/**
	 * モニター情報を取得する。<br />
	 *
	 * 歴史的理由により、ROI 内部では Monitor のことを Event と呼ぶことがあり、
	 * 特に、メールテンプレートの中では
	 * <blockquote>
	 * 	application.event
	 * </blockquote>
	 *
	 * の形で参照されることがあります。その互換性のため、このメソッドは必要とされています。<br />
	 *
	 * 通常は getMonitor() を利用ください。
	 *
	 * @return
	 */
	@Deprecated
	public Monitor getEvent() {
		return monitor;
	}

	/* ================================================================= */
	// Digester 用 setter

	public void setWinStateString(String name) {
		winState = WinState.valueOf(name);
	}

	public void setEnqueteSubmitStateString(String name) {
		enqueteSubmitState = SubmitState.valueOf(name);
	}

	public void setReceiptSubmitStateString(String name) {
		receiptSubmitState = SubmitState.valueOf(name);
	}

	public void setInvoiceSubmitStateString(String name) {
		invoiceSubmitState = SubmitState.valueOf(name);
	}

	/* ================================================================= */
	// getter/setter

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public WinState getWinState() {
		return winState;
	}

	public void setWinState(WinState winState) {
		this.winState = winState;
	}

	public SubmitState getEnqueteSubmitState() {
		return enqueteSubmitState;
	}

	public void setEnqueteSubmitState(SubmitState enqueteSubmitState) {
		this.enqueteSubmitState = enqueteSubmitState;
	}

	public SubmitState getReceiptSubmitState() {
		return receiptSubmitState;
	}

	public void setReceiptSubmitState(SubmitState receiptSubmitState) {
		this.receiptSubmitState = receiptSubmitState;
	}

	public SubmitState getInvoiceSubmitState() {
		return invoiceSubmitState;
	}

	public void setInvoiceSubmitState(SubmitState invoiceSubmitState) {
		this.invoiceSubmitState = invoiceSubmitState;
	}

	public boolean isAgreed() {
		return agreed;
	}

	public void setAgreed(boolean agreed) {
		this.agreed = agreed;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
