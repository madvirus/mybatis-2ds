package dao;

import model.PaymentInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentInfoDao {
	@Insert("insert into PAYMENT_INFO (PRICE) values (#{price})")
	@Options(keyProperty = "id", useGeneratedKeys = true)
	void save(PaymentInfo paymentInfo);

}
