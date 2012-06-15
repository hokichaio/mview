package jp.co.netmile.crwdsrc.dto.enumeration;

/**
 * メール配信優先度
 *
 * @author Kenkichi Mahara
 *
 */
public enum MailDeliverType {
	/** 24時間、すぐにメールを送信 */
	即送信(0),

	/** 9:00～21:00 の間はメール送信。それ以外の時間帯にキューイングされたメールは、次の 9:00 以降に送信される。 */
	通常(1),
	;

	private final int id;

	private MailDeliverType(int id) {
		this.id = id;
	}

	/**
	 * id から MailDeliverType を取得します。<br />
	 * 適切な id でない場合は null を返します。
	 *
	 * @param id
	 * @return
	 */
	public static MailDeliverType valueOfId(int id) {
		for (MailDeliverType obj : values()) {
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
