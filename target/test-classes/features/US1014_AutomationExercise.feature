Feature: US1014 Automation exercise sitesinde kullanici olusturma

  @wip
  Scenario: TC19 Kullanici automation excercise sayfasinda kullanici olusturabilmeli

  Given kullanici "automationUrl" anasayfaya gider
  And user sign in linkine tiklar
  And user Create and account bölümüne email adresi girer
  And Create an Account butonuna basar
  And user kisisel bilgilerini ve iletisim bilgilerini girer
  And user Register butonuna basar
  Then hesap olustugunu dogrulayin
