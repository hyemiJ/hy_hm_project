package com.example.mokkoji_backend;






class MokkojiBackendApplicationTests {



//    //@Test
//    public void testOptionService() {
//    	Products entity = productService.findById(2L);
//    	
//    	ProductOptions option1 = ProductOptions.builder()
//    			.productId(2L)
//    			.content("박물관 키링(신라의 미소)")
//    			.price(0)
//    			//.product(entity)
//    			.build();
//    	ProductOptions option2 = ProductOptions.builder()
//    			.productId(2L)
//    			.content("테스트중")
//    			.price(100)
//    			//.product(entity)
//    			.build();
//    	ProductOptions option3 = ProductOptions.builder()
//    			.productId(2L)
//    			.content("테스트중2")
//    			//.product(entity)
//    			.price(100)
//    			.build();
//    	List<ProductOptions> list = new ArrayList<>();
//    	list.add(option1);
//    	list.add(option2);
//    	list.add(option3);
//    	for (ProductOptions option : list) {
//			System.out.println(option);
//		}
//    	
//    	
//    	for (ProductOptions option : list) {
//    		optionService.save(option);
//		}
//    	//optionService.save(option2);
//    }
//
//	@Test
//    public void testSendEmail() {
//     
//        SmtpDTO dto = SmtpDTO.builder()
//                .contentMail("yacobleeee@hanmail.net") 
//                .contentMain("테스트 내용입니다. 문의 사항은 여기로")
//                .contentTitle("문의글 제목입니다.")
//                .build();
//
//        emailService.sendMessage("test1","test2");
//        System.out.println("Email sent successfully.");
//        //verify(javaMailSender, times(1)).send(any(SimpleMailMessage.class)); 
//    }
//
//	@Test
//    public void testRegist() {
//    	 List<Regist> regists = registRepository.findAll();
//    	 
//    	 System.out.println(regists);
//    }
//
//	@Test
//    public void testSms () {
//    	   // Given: 메시지 객체를 생성합니다.
//        Message message = new Message();
//        message.setFrom("01040529406");  // 발신자 번호
//        message.setTo("01040529406");    // 수신자 번호
//        message.setText("테스트 메시지입니다. JUnit을 통해 보냅니다.");
//
//        // When: SMS를 실제로 전송합니다.
//        SingleMessageSentResponse response = sendMessageService.sendOne(new SingleMessageSendingRequest(message));
//
//        // Then: 응답이 null이 아님을 확인합니다.
//        assertNotNull(response);
//        System.out.println("SMS 전송 응답: " + response);
//    }
    
   
    
}
