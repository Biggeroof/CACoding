package use_case.clear_users;

import java.util.ArrayList;

public class ClearInteractor implements ClearInputBoundary{
    final ClearOutputBoundary clearPresenter;
    final ClearUserDataAccessInterface userDataAccessObject;

    public ClearInteractor(ClearOutputBoundary clearOutputBoundary, ClearUserDataAccessInterface clearUserDataAccessInterface)
    {
        clearPresenter = clearOutputBoundary;
        userDataAccessObject = clearUserDataAccessInterface;
    }

    @Override
    public void execute() {
        ArrayList<String> clearedUsers = userDataAccessObject.clearUsers();
        clearPresenter.prepareSuccessView(clearedUsers);
    }
}
