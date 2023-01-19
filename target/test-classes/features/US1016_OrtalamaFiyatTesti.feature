Feature: US1016 aranan urunun ortlama fiyatini test etme

  @detay
  Scenario: TC21 aranan urunun ortalama fiyati test edilebilmeli

    Given kullanici "amazonUrl" anasayfaya gider
    Then amazon arama kutusuna "Nutella" yazip aratir
    And cikan urunlerden "Nutella" kelimesi icerenlerin fiyat ortalamasinin 20 euro altinda oldugunu test eder