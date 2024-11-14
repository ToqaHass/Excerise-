package edu.gmu.cs321;

public class Aproval {
    private PetitionForm currentForm;

    public Aproval(PetitionForm currentForm) {
        this.currentForm = currentForm;
    }
    public PetitionForm getCurrentForm() {
        return currentForm;
    }
    public void setCurrentForm(PetitionForm currentForm) {
        this.currentForm = currentForm;
    }
    public void approveForm(PetitionForm form) {
        form.setStatus("APPROVED");
        System.out.println("Form ID " + form.getFormId() + " has been approved.");
        sendNotification(form);
    }
    public void rejectForm(PetitionForm form, String reason) {
        form.setStatus("REJECTED");
        form.setReasons(reason);
        System.out.println("Form ID " + form.getFormId() + " has been rejected. Reason: " + reason);
        sendNotification(form);
    }
    private void sendNotification(PetitionForm form) {
        System.out.println("Notification: Form ID " + form.getFormId() + " status is now: " + form.getStatus());
    }
}
