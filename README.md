# CommonAdapter
打造Android万能适配器。
 

使用方式：


        lv_list.setAdapter(new CommonAdapter<Bean>(this, mData, R.layout.item_list_main) {
            @Override
            public void convert(CommonAdapter.ViewHolder holder, Bean bean, int p) {
                holder.setText(R.id.tv_title, bean.getTitle())
                        .setText(R.id.tv_content, bean.getContent())
                        .setImageResource(R.id.img_pic, bean.getPic());
            }
        });
