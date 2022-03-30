package in.co.Test;

import in.co.bean.AuthenticateBean;
import in.co.model.AuthenticateModel;

public class TestAuthenticate {
	public static void main(String[] args) throws Exception {
		testAuth();
	}

	public static void testAuth() throws Exception {
		AuthenticateBean bean = new AuthenticateBean();
		bean.setId("1234");
		bean.setPassword("1234");

		AuthenticateBean bean1;
		AuthenticateModel model = new AuthenticateModel();
		bean1 = model.Authenticate(bean);

		if (bean1 != null) {
			System.out.println("Welcome User!");
		} else {
			System.out.println("Invalid User Credentials!");
		}

	}
}

