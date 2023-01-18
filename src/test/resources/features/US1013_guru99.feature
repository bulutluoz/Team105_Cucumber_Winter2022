Feature:US1013 Kullanici Web tablosunda istedigi degerin varligini test eder

  Scenario: TC18 Kullanici tablodan deger test edebilmeli

    Given kullanici "guru99Url" anasayfaya gider
    And guru99 cookies kabul eder
    Then Company listesini consola yazdirir
    And "NCC" in listede oldugunu test eder

