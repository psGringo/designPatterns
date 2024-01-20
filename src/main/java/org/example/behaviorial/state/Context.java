package org.example.behaviorial.state;

public class Context {
    private State state;

    public void clickPlay() {
        state.Play();
    }

    public void clickStop() {
        state.Stop();
    }


    public void setState(State state) {
        this.state = state;
    }

}
