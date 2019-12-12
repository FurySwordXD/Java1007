public class InvoiceItem
{
    private String id;
    private String description;
    private Integer quantity;
    private Double unitPrice;

    public InvoiceItem(String id, String description, int quantity, double unitPrice)
    {
        this.id = id;
        this.description = description;
        setQuantity(quantity);
        setUnitPrice(unitPrice);
    }

    public String getId() { return id; }
    public String getDescription() { return description; }
    public Integer getQuantity() { return quantity; }
    public Double getUnitPrice() { return unitPrice; }
    public Double getTotal() { return unitPrice * quantity; }

    public void setQuantity(int quantity) { this.quantity = quantity; }
    public void setUnitPrice(double unitPrice) { this.unitPrice = unitPrice; }

    public String toString() {
        return "InvoiceItem [id=" + id + ", desc=" + description + ", qty=" + quantity + ", unitPrice=" + unitPrice + "]";
    }
}