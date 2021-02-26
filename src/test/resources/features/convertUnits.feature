# Juan David Garcia

  Feature: As a User I need to convert velocity and dimensions units
    to make calculations
    and validate results

    Background: Open the ConvertWorld site
    Given that user opens Convertworld page

    @convert_lenght
  Scenario Outline: Convert a lenght from one unit to another
    When he introduces the data to make calculations
    |lenght  |unit_from  |unit_to  |result  |
    |<lenght>|<unit_from>|<unit_to>|<result>|
    Then he validates the "<result>"

    Examples:
    |lenght  |unit_from  |unit_to         |result  |
    |69      |Metro (m)  |Milla (mi)      |0,04 mi |

      @convert_velocity
      Scenario Outline: Convert a velocity from one unit to another
        When he introduces the data to change the velocity unit
          |velocity  |unit_from  |unit_to  |result  |
          |<velocity>|<unit_from>|<unit_to>|<result>|
        Then he validates the velocity unit "<result>"

        Examples:
          |velocity  |unit_from  |unit_to         |result    |
          |69        |km/h       |m/s             |19,17 m/s |

    @convert_area
    Scenario Outline: Convert an area value from one unit to another
      When he introduces the data to change the area unit
        |area  |unit_from  |unit_to  |result  |
        |<area>|<unit_from>|<unit_to>|<result>|
      Then he validates the area unit "<result>"

      Examples:
        |area  |unit_from                   |unit_to              |result        |
        |69    |Kilómetro cuadrado (km²)    |Metro cuadrado (m²)  |69 000 000 m² |



