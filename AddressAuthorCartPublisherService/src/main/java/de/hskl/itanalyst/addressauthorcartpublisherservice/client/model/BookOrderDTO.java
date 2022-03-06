package de.hskl.itanalyst.addressauthorcartpublisherservice.client.model;

public class BookOrderDTO {
    public String title;
    public Long amount;

    public BookOrderDTO(String title, Long amount) {
        this.title = title;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "BookOrderDTO{" +
                "title='" + title + '\'' +
                ", amount=" + amount +
                '}';
    }
}
