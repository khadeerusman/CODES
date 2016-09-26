package in.ac.kletech.customer;

public class CustomerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
				RegularCustomer[] RC = new RegularCustomer[2];
				RC[0]=new RegularCustomer(1101, "Khadeer", 9849998400l, 1500);
				RC[1]=new RegularCustomer(1101, "Khadeer", 9849998400l, 1600);
				
				for(int i=0;i<RC.length;i++){
					RC[i].printCustomerInfo();
					RC[i].computecustBillAmt();
				}
				
				for(int i=0;i<RC.length;i++){
					for(int j=i+1;j<RC.length;j++)
					{
						if(RC[i].custID==RC[j].custID)
							RC[i+1].RegularDiscount();
					}
				}
				PrivilegedCustomer[] PC = new PrivilegedCustomer[3];
				PC[0]=new PrivilegedCustomer(2202, "Khadeer", 9492083480l, 1500);
				PC[1]=new PrivilegedCustomer(3303, "Aadil", 9030266071l, 1200);
				
				
				for(int i=0;i<PC.length;i++){
					PC[i].printCustomerInfo();
					PC[i].computecustBillAmt();
				}
				
	}
}
				