Feature: saldos y movimientos
  Scenario: consumir servicio y obtener una respuesta exitosa
    * url 'http://localhost:8080/api/saldosymovimientos'
    * def datarequest = read('datajson/SaldosYMovimientos.json')

    Given request datarequest
    When method POST
    Then status 200
