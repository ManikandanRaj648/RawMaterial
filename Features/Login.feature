Feature:Login
	@LoginUse
  Scenario: Successful Login with Valid Credentials
    Given User Launch Chrome Browser
    When User enters Email as <uname> and Password as <pword>
    When Click on Login

    Examples: 
    |uname|pword   |
    |1077 |Che@1234|