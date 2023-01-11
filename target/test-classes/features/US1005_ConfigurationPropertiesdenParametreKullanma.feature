@wip
Feature: US1005 Kullanici configuration.properties'de yazilan datalari parametre olarak kullanir
  # 3 Scenario olusturup, amazon,wisequarter ve walmart anasayfalarina gidin
  # ve o anasayfalara gittigimizi test edin

  Scenario: TC06 Kullanici amazon sitesine gidisi test eder

    Given kullanici "amazonUrl" anasayfaya gider
    Then url de "amazon" oldugunu test eder
    And sayfayi kapatir


  Scenario: TC07 Kullanici wisequarter sitesine gidisi test eder

    Given kullanici "wqUrl" anasayfaya gider
    Then url de "wisequarter" oldugunu test eder
    And sayfayi kapatir

  Scenario: TC08 Kullanici walmart sitesine gidisi test eder

    Given kullanici "walmartUrl" anasayfaya gider
    Then url de "walmart" oldugunu test eder
    And sayfayi kapatir