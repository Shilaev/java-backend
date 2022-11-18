package shilaev.dao;

import org.springframework.stereotype.Component;
import shilaev.models.Account;

import java.util.LinkedList;
import java.util.List;

@Component
public class AccountDAO {
    private List<Account> accounts;

    {
        accounts = new LinkedList<>();
        accounts.add(new Account(
                0,
                "4828629057700799",
                423591f,
                "Visa"
        ));
        accounts.add(new Account(
                2,
                "4975390938505649",
                179626f,
                "MasterCard"
        ));
        accounts.add(new Account(
                3,
                "5050433404730823",
                717.677413f,
                "Mir"
        ));
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}
