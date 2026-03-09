package de.gfn.basic.patterns.adapter;

public class PostingToMessageAdapter implements Message {

    private Posting posting;

    public PostingToMessageAdapter(Posting posting) {
        this.posting = posting;
    }

    @Override
    public void compute() {
        posting.post();
    }
}
