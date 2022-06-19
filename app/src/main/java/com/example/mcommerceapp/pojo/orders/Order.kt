package orders

import com.example.example.TaxLines
import com.example.mcommerceapp.pojo.orders.NoteAttributes
import com.google.gson.annotations.SerializedName


data class Order (

  @SerializedName("id"                          ) var id                       : Long?                      = null,
  @SerializedName("admin_graphql_api_id"        ) var adminGraphqlApiId        : String?                   = null,
  @SerializedName("app_id"                      ) var appId                    : Int?                      = null,
  @SerializedName("browser_ip"                  ) var browserIp                : String?                   = null,
  @SerializedName("buyer_accepts_marketing"     ) var buyerAcceptsMarketing    : Boolean?                  = null,
  @SerializedName("cancel_reason"               ) var cancelReason             : String?                   = null,
  @SerializedName("cancelled_at"                ) var cancelledAt              : String?                   = null,
  @SerializedName("cart_token"                  ) var cartToken                : String?                   = null,
  @SerializedName("checkout_id"                 ) var checkoutId               : String?                   = null,
  @SerializedName("checkout_token"              ) var checkoutToken            : String?                   = null,
  @SerializedName("closed_at"                   ) var closedAt                 : String?                   = null,
  @SerializedName("confirmed"                   ) var confirmed                : Boolean?                  = null,
  @SerializedName("contact_email"               ) var contactEmail             : String?                   = null,
  @SerializedName("created_at"                  ) var createdAt                : String?                   = null,
  @SerializedName("currency"                    ) var currency                 : String?                   = null,
  @SerializedName("current_subtotal_price"      ) var currentSubtotalPrice     : String?                   = null,
  @SerializedName("current_subtotal_price_set"  ) var currentSubtotalPriceSet  : CurrentSubtotalPriceSet?  = CurrentSubtotalPriceSet(),
  @SerializedName("current_total_discounts"     ) var currentTotalDiscounts    : String?                   = null,
  @SerializedName("current_total_discounts_set" ) var currentTotalDiscountsSet : CurrentTotalDiscountsSet? = CurrentTotalDiscountsSet(),
  @SerializedName("current_total_duties_set"    ) var currentTotalDutiesSet    : String?                   = null,
  @SerializedName("current_total_price"         ) var currentTotalPrice        : String?                   = null,
  @SerializedName("current_total_price_set"     ) var currentTotalPriceSet     : CurrentTotalPriceSet?     = CurrentTotalPriceSet(),
  @SerializedName("current_total_tax"           ) var currentTotalTax          : String?                   = null,
  @SerializedName("current_total_tax_set"       ) var currentTotalTaxSet       : CurrentTotalTaxSet?       = CurrentTotalTaxSet(),
  @SerializedName("customer_locale"             ) var customerLocale           : String?                   = null,
  @SerializedName("device_id"                   ) var deviceId                 : String?                   = null,
  @SerializedName("discount_codes"              ) var discountCodes            : ArrayList<String>         = arrayListOf(),
  @SerializedName("email"                       ) var email                    : String?                   = null,
  @SerializedName("estimated_taxes"             ) var estimatedTaxes           : Boolean?                  = null,
  @SerializedName("financial_status"            ) var financialStatus          : String?                   = null,
  @SerializedName("fulfillment_status"          ) var fulfillmentStatus        : String?                   = null,
  @SerializedName("gateway"                     ) var gateway                  : String?                   = null,
  @SerializedName("landing_site"                ) var landingSite              : String?                   = null,
  @SerializedName("landing_site_ref"            ) var landingSiteRef           : String?                   = null,
  @SerializedName("location_id"                 ) var locationId               : String?                   = null,
  @SerializedName("name"                        ) var name                     : String?                   = null,
  @SerializedName("note"                        ) var note                     : String?                   = null,
  @SerializedName("note_attributes"             ) var noteAttributes           : ArrayList<NoteAttributes> = arrayListOf(),
  @SerializedName("number"                      ) var number                   : Int?                      = null,
  @SerializedName("order_number"                ) var orderNumber              : Int?                      = null,
  @SerializedName("order_status_url"            ) var orderStatusUrl           : String?                   = null,
  @SerializedName("original_total_duties_set"   ) var originalTotalDutiesSet   : String?                   = null,
  @SerializedName("payment_gateway_names"       ) var paymentGatewayNames      : ArrayList<String>         = arrayListOf(),
  @SerializedName("phone"                       ) var phone                    : String?                   = null,
  @SerializedName("presentment_currency"        ) var presentmentCurrency      : String?                   = null,
  @SerializedName("processed_at"                ) var processedAt              : String?                   = null,
  @SerializedName("processing_method"           ) var processingMethod         : String?                   = null,
  @SerializedName("reference"                   ) var reference                : String?                   = null,
  @SerializedName("referring_site"              ) var referringSite            : String?                   = null,
  @SerializedName("source_identifier"           ) var sourceIdentifier         : String?                   = null,
  @SerializedName("source_name"                 ) var sourceName               : String?                   = null,
  @SerializedName("source_url"                  ) var sourceUrl                : String?                   = null,
  @SerializedName("subtotal_price"              ) var subtotalPrice            : String?                   = null,
  @SerializedName("subtotal_price_set"          ) var subtotalPriceSet         : SubtotalPriceSet?         = SubtotalPriceSet(),
  @SerializedName("tags"                        ) var tags                     : String?                   = null,
  @SerializedName("tax_lines"                   ) var taxLines                 : ArrayList<TaxLines>         = arrayListOf(),
  @SerializedName("taxes_included"              ) var taxesIncluded            : Boolean?                  = null,
  @SerializedName("test"                        ) var test                     : Boolean?                  = null,
  @SerializedName("token"                       ) var token                    : String?                   = null,
  @SerializedName("total_discounts"             ) var totalDiscounts           : String?                   = null,
  @SerializedName("total_discounts_set"         ) var totalDiscountsSet        : TotalDiscountsSet?        = TotalDiscountsSet(),
  @SerializedName("total_line_items_price"      ) var totalLineItemsPrice      : String?                   = null,
  @SerializedName("total_line_items_price_set"  ) var totalLineItemsPriceSet   : TotalLineItemsPriceSet?   = TotalLineItemsPriceSet(),
  @SerializedName("total_outstanding"           ) var totalOutstanding         : String?                   = null,
  @SerializedName("total_price"                 ) var totalPrice               : String?                   = null,
  @SerializedName("total_price_set"             ) var totalPriceSet            : TotalPriceSet?            = TotalPriceSet(),
  @SerializedName("total_price_usd"             ) var totalPriceUsd            : String?                   = null,
  @SerializedName("total_shipping_price_set"    ) var totalShippingPriceSet    : TotalShippingPriceSet?    = TotalShippingPriceSet(),
  @SerializedName("total_tax"                   ) var totalTax                 : String?                   = null,
  @SerializedName("total_tax_set"               ) var totalTaxSet              : TotalTaxSet?              = TotalTaxSet(),
  @SerializedName("total_tip_received"          ) var totalTipReceived         : String?                   = null,
  @SerializedName("total_weight"                ) var totalWeight              : Int?                      = null,
  @SerializedName("updated_at"                  ) var updatedAt                : String?                   = null,
  @SerializedName("user_id"                     ) var userId                   : String?                   = null,
  @SerializedName("customer"                    ) var customer                 : Customer?                 = Customer(),
  @SerializedName("discount_applications"       ) var discountApplications     : ArrayList<String>         = arrayListOf(),
  @SerializedName("fulfillments"                ) var fulfillments             : ArrayList<String>         = arrayListOf(),
  @SerializedName("line_items"                  ) var lineItems                : ArrayList<LineItems>      = arrayListOf(),
  @SerializedName("payment_terms"               ) var paymentTerms             : String?                   = null,
  @SerializedName("refunds"                     ) var refunds                  : ArrayList<String>         = arrayListOf(),
  @SerializedName("shipping_lines"              ) var shippingLines            : ArrayList<String>         = arrayListOf()

)