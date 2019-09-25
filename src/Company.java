class Company {

        private String id;

        private Products[] products;

        public String getId ()
        {
            return id;
        }

        public void setId (String id)
        {
            this.id = id;
        }

        public Products[] getProducts ()
        {
            return products;
        }

        public void setProducts (Products[] products)
        {
            this.products = products;
        }

    public Company(String id, Products[] products) {
        this.id = id;
        this.products = products;
    }

    @Override
        public String toString()
        {
            return "ClassPojo [id = "+id+", products = "+products+"]";
        }
    }