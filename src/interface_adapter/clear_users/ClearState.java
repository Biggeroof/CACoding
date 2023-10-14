package interface_adapter.clear_users;

import java.util.ArrayList;

public class ClearState {
    private String clearError = null;
    private ArrayList<String> clearedUsers;
    public ArrayList<String> getClearedUsers() {
        return clearedUsers;
    }

    public void setClearedUsers(ArrayList<String> clearedUsers) {
        this.clearedUsers = clearedUsers;
    }
    public ClearState(ClearState copy)
    {
        clearError = copy.clearError;
    }
    public ClearState() {
    }
    public String getClearError() {
        return clearError;
    }

    public void setClearError(String clearError) {
        this.clearError = clearError;
    }

    public String toString()
    {
        StringBuilder formatted = new StringBuilder();
        for(String user : clearedUsers)
        {
            formatted.append(user).append("\n");
        }
        return formatted.toString();
    }
}
