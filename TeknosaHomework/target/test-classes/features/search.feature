@product

Feature: Magaza arama senaryosu

  Scenario Outline: Magaza arama
    Given Bildirim kabul edilir
    When Sayfa asagiya kaydirilir
    And Magazalarimiz butonuna basilir
    And Magaza Bulucudan <il> secimi yapilir
    And Magaza Bulucudan <ilce> secimi yapilir


    Examples:
      | il     | ilce        |
      | Ankara | Yenimahalle |

