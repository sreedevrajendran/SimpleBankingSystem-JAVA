# Test Instructions for Simple Banking System (Java)

## Prerequisites
- Ensure you have Java installed (`java -version`)
- Compile the code:  
  `javac BankAccount.java BankSystem.java`

## Manual Testing Steps

1. **Run the program:**  
   `java BankSystem`

2. **Create Account:**  
   - Select option 1, enter a name and account number.
   - Verify the success message.

3. **Deposit Money:**  
   - Select option 2, enter a positive amount.
   - Check for deposit confirmation and updated balance.

4. **Withdraw Money:**  
   - Select option 3, enter an amount less than or equal to the balance.
   - Check for withdrawal confirmation and updated balance.
   - Try withdrawing more than the balance to verify error handling.

5. **Check Balance:**  
   - Select option 4.
   - Verify the displayed balance matches your transactions.

6. **Exit:**  
   - Select option 5 to quit the program.

## Notes
- Try invalid inputs (negative amounts, actions before account creation) to verify error handling.
