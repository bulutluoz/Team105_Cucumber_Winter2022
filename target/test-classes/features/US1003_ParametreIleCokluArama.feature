
Feature: US1003 Kullanici parametre olarak girilen degerleri aratir

  @p1
  Scenario: TC03 Kullanici Parametreli method ile Nutella aratir

    Given kullanici amazon anasayfaya gider
    Then amazon arama kutusuna "Nutella" yazip aratir
    And arama sonuclarinin "Nutella" icerdigini test eder
    And sayfayi kapatir

  @p2
  Scenario: TC04 Kullanici Parametreli method ile Java aratir
    Given kullanici amazon anasayfaya gider
    Then amazon arama kutusuna "Java" yazip aratir
    And arama sonuclarinin "Java" icerdigini test eder
    And 5 saniye bekler
    And sayfayi kapatir

  @p1
  Scenario: TC05 Kullanici Parametreli method ile Samsung aratir
    Given kullanici amazon anasayfaya gider
    Then amazon arama kutusuna "Hiyar" yazip aratir
    And arama sonuclarinin "Hiyar" icerdigini test eder
    And sayfayi kapatir