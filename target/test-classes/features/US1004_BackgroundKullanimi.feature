
@wip
Feature: US1005 Kullanici bastaki ortak adimlar icin Background kullanir

  Background: Tum scenario'lar icin ortak ilk adim
    Given kullanici amazon anasayfaya gider

  Scenario: TC03 Kullanici Parametreli method ile Nutella aratir

    Then amazon arama kutusuna "Nutella" yazip aratir
    And arama sonuclarinin "Nutella" icerdigini test eder
    And sayfayi kapatir


  Scenario: TC04 Kullanici Parametreli method ile Java aratir

    Then amazon arama kutusuna "Java" yazip aratir
    And arama sonuclarinin "Java" icerdigini test eder
    And sayfayi kapatir


  Scenario: TC05 Kullanici Parametreli method ile Samsung aratir

    Then amazon arama kutusuna "Samsung" yazip aratir
    And arama sonuclarinin "Samsung" icerdigini test eder
    And sayfayi kapatir

