package com.example.mokkoji_backend.service.login;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.mokkoji_backend.domain.UserAndAddressDTO;
import com.example.mokkoji_backend.entity.login.Address;
import com.example.mokkoji_backend.entity.login.Users;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;


@Log4j2
@Service("UserAdminService")
@RequiredArgsConstructor
public class UserAdminServiceImpl implements UserAdminService {
	private final AddressService addressService;
	private final UsersService userService;
	
	
@Override
public String userinfoAllupdate(UserAndAddressDTO requestDTO) {
		List<Address> addr = requestDTO.getUserinfoAddress();
		Users user = requestDTO.getUserinfo();
		List<Address> oldAddr =  addressService.findUserAddress(user.getUserId());
		log.info(addr);
		log.info(oldAddr);
		
		String result =" ";
		// 유저와 주소 정보가 유효한지 확인
		if (addr != null && !addr.isEmpty() && user != null) {
			// 유저 정보 업데이트
			log.info("err_1");
			
			for (Address oldAddress : oldAddr) {
					addressService.deleteAddress(user.getUserId(), oldAddress.getAddressId());  
			}
	
			for (Address newAddress : addr) {
				addressService.register(newAddress);
			}
			userService.updateUser(user.getUserId(),user.getPhoneNumber(), user.getEmail());			
		}
			
		return result ="성공";
	}


}
