Feature: US1015 Amazonda arama sonuc listesinde istedigimiz urunun varligini test etme

  @go
  Scenario: TC20 arama sonuclarinda spesifik elementin varligini test etme

    Given kullanici "amazonUrl" anasayfaya gider
    Then amazon arama kutusuna "Nutella" yazip aratir
    And cikan urunler icinde "Nutella & GO" oldugunu test eder